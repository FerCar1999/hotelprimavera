package com.sv.hotelprimavera.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.hotelprimavera.interfaces.InterfaceUsuario;
import com.sv.hotelprimavera.models.Usuario;
import com.sv.hotelprimavera.serviceInterface.IUsuarioService;
@Service
public class UsuarioService implements IUsuarioService{

	@Autowired 
	private InterfaceUsuario data;
	@Override
	public List<Usuario> listar() {
		return data.findActive();
	}

	@Override
	public Usuario listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public Usuario save(Usuario u) {
		// TODO Auto-generated method stub
		
		return data.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return data.save(u);
	}

	@Override
	public Usuario delete(Usuario u) {
		// TODO Auto-generated method stub
		return data.save(u);
	}

	@Override
	public Usuario listarPorEmail(String correo) {
		return data.findCorreo(correo);
	}

	//encriptacion md5
	@Override
	public  String getMd5(String input)
	{
		try {

			// Static getInstance method is called with hashing MD5
			MessageDigest md = MessageDigest.getInstance("MD5");

			// digest() method is called to calculate message digest
			// of an input digest() return array of byte
			byte[] messageDigest = md.digest(input.getBytes());

			// Convert byte array into signum representation
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}

		// For specifying wrong message digest algorithms
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}
