package br.com.imobiliaria.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.imobiliaria.entity.Imovel;
import br.com.imobiliaria.entity.Usuario;
import br.com.imobiliaria.helper.GenericDaoImpl;

public class MassaTeste {

	GenericDaoImpl<Usuario>usuarioDao = new GenericDaoImpl<Usuario>(Usuario.class);
	GenericDaoImpl<Imovel>imovelDao = new GenericDaoImpl<Imovel>(Imovel.class);
	
	@Test
	public void run(){
		massaParaImoveis();
		massaParaUsuarios();
	}
	
	public void massaParaImoveis() {
		List<Imovel> imoveis = new ArrayList<Imovel>();
		
		Imovel imovel = new Imovel(1, "São Paulo", "Suzano", "Jardim da Saúde", "Lhubinko Rajkov", "Casa", "Imóvel com 6 cômodos perto de um posto policial",
				15000.00, "Compra");
		imoveis.add(imovel);

		imovel = new Imovel(2, "São Paulo", "Mogi das Cruzes", "Jardim Novo Mundo", "Rua dos Desesperados", "Sobrado", "Perto do nada",
				190000.00, "Compra");
		imoveis.add(imovel);

		imovel = new Imovel(3, "Acre", "Poá", "Jardim Oliveira", "Rua dos Andantes", "Apartamento", "Perto da Mata",
				300.00, "Aluguel");
		imoveis.add(imovel);
		

		for (Imovel im : imoveis) {
			imovelDao.create(im);
		}
	}
	
	public void massaParaUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario(1 , "edsilvasp@hotmail.com" , "Ederson" , "123", "da Silva" , "edersp");
		usuarios.add(usuario);

		usuario = new Usuario(2 , "regiane.costa@bol.com" , "Regiane" , "1234" , "Costa Gomes Nascimento" , "regianec");
		usuarios.add(usuario);
		
		usuario = new Usuario(3 , "gabriel.maced@yahoo.com" , "Gabriel" , "555" , "Torres do Santos" , "gsantos");
		usuarios.add(usuario);

		for (Usuario us : usuarios) {
			usuarioDao.create(us);
		}
	}

	

}
