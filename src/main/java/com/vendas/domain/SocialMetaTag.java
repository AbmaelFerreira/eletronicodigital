package com.vendas.domain;

import java.io.Serializable;

@SuppressWarnings("serial") //adicionado para omitir o warning pos a reclamação é por que não adicionamos o id referente a implementaçãoo, so que é gerado pelo jdk quando roda aplicação
public class SocialMetaTag implements Serializable{

	private String site;
	private String title;
	private String url;
	private String image;
	
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
