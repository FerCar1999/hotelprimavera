package com.sv.hotelprimavera.controller;

import com.mysql.cj.Session;
import com.sv.hotelprimavera.models.*;
import com.sv.hotelprimavera.serviceInterface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Controller
@RequestMapping
public class ClienteController {
    @Autowired
    private IUsuarioService service;

    @Autowired
    private IReservaService servicere;

    @Autowired
    private IDetalleUsuarioService servicedu;

    @Autowired
    private IHabitacionService servicehab;

    @Autowired
    private ITipoHabitacionService serviceth;

    @Autowired
    private IEstadoHabitacionService serviceeh;

    @GetMapping("/cliente/index")
    public String index(Model modelo) {

        return "/cliente/index";
    }
    @GetMapping("/cliente/list")
    public String lista(Model modelo) {
        List<Habitacion> h=servicehab.listarlimpias();
        List<TipoHabitacion> th=serviceth.listar();
        modelo.addAttribute("habitacion",h);
        modelo.addAttribute("tipohabitacion",th);
        return "/cliente/list";
    }
    @GetMapping("/cliente/reservas")
    public String listaReservas(Model modelo) {
        List<Reserva> r=servicere.listarPorUsuario(SessionHandler.id);
        modelo.addAttribute("reserva",r);
        return "/cliente/mis_reservas";
    }
    @GetMapping("cliente/reserva/{id}")
    public String reservaCliente(@PathVariable int id,Model modelo) {
        Reserva reserva=new Reserva();
        reserva.setIdHabitacion(servicehab.listarId(id));
        modelo.addAttribute("habitacion",servicehab.listarId(id));
        modelo.addAttribute("reserva",reserva);
        return "/cliente/reserva_realizada";
    }
    @PostMapping("reserva/insertarcliente")
    public String reservaClienteInsert(@ModelAttribute("reserva") Reserva r){

            Habitacion h=servicehab.listarId(r.getIdHabitacion().getIdHabitacion());
            Usuario u=service.listarId(SessionHandler.id);
            EstadoHabitacion eh=serviceeh.listarId(4);
            Reserva rv=new Reserva();
            rv.setIdHabitacion(h);
            rv.setIdUsuario(u);
            System.out.println(r.getFechaFin());
            System.out.println(r.getFechaInicio());
            rv.setFechaInicio(r.getFechaInicio());
            rv.setFechaFin(r.getFechaFin());
            long diff= (rv.getFechaFin().getTime()-rv.getFechaInicio().getTime())/ (24 * 60 * 60 * 1000);
            System.out.println(diff+"xdxdxdxdxd");
            double totalpago=diff*h.getPrecioHabitacion();
            rv.setTotalPago(totalpago);
            System.out.println(totalpago+"hhhhhhhhhhhhhhhhhh");
            h.setIdEstadoHabitacion(eh);
            servicehab.save(h);
            servicere.save(rv);

            return "redirect:/cliente/index";


    }

}
