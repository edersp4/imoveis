package br.com.imobiliaria.managed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

import br.com.imobiliaria.entity.Imovel;
import br.com.imobiliaria.helper.GenericDaoImpl;

@ManagedBean(name="imovel")
@SessionScoped
public class ImovelMb {

	List<Imovel>imoveis = new ArrayList<Imovel>();
	Imovel imov = new Imovel();
	
	
	public void listarImovel(){
		GenericDaoImpl<Imovel>imovelDao = new GenericDaoImpl<Imovel>(Imovel.class);
		
		imoveis = imovelDao.listAll();
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public Imovel getImov() {
		return imov;
	}

	public void setImov(Imovel imov) {
		this.imov = imov;
	}
	
	public void obterObjeto(ActionEvent event) {  
        UIParameter parameter = (UIParameter) event.getComponent().findComponent("objeto");  
        this.imov = (Imovel) parameter.getValue();  
}  
	
}
