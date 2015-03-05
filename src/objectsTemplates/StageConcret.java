package objectsTemplates;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;







//by Thomas Davin

@XmlRootElement
public class StageConcret  {
	
	
	private String uv;
	//private int directeur;
	private String nomStage;
	private Calendar date;
	private Calendar finCandidature;
	private String lieu;
	private String infos;
	private List<String> candidats;
	private List<String> accepte;
	private List<String> refuse;
	private List<String> attente;
	//private ArrayList<Observateur> ListPompierCandidat;
	
	
	/*@Override
	public void setDirecteur(int idDirecteur) {
		// TODO Auto-generated method stub
		this.directeur=idDirecteur;
	}

	@Override
	public int getDirecteur() {
		// TODO Auto-generated method stub
		return directeur;
	}*/
	
	
	public void setNomStage(String nom){
		this.nomStage=nom;
		
	}
	
	
	public String getNomStage(){
		return nomStage;
		
	}
	
	
	public void setUV(String UV) {
		// TODO Auto-generated method stub
		this.uv=UV;
	}

	
	public String getUV() {
		// TODO Auto-generated method stub
		return uv;
	}
	
	
	public void setDate(Calendar date) {
		
		this.date=date;
	}

	
	
	public Calendar getDate() {
		// TODO Auto-generated method stub
				
		return this.date;
	}
		
	
	public Calendar getFinCandidature(){
		
		return finCandidature;
		
	}
	
	
	public void setFinCandidature(Calendar date){
		
		this.finCandidature=date;
	}
	
	
	public void setLieu(String lieu) {
		
		this.lieu=lieu;
		
	}

	
	public String getLieu() {
		// TODO Auto-generated method stub
		return lieu;
	}

	
	public void setInfos(String infos) {
		
		
		this.infos=infos;
		
	}

	
	public String getInfos() {
		// TODO Auto-generated method stub
		return infos;
	}

	
	public void setCandidats(List<String> candidats) {
		// TODO Auto-generated method stub
		this.candidats=candidats;
	}

	
	public List<String> getCandidats() {
		// TODO Auto-generated method stub
		return candidats;
	}

	
	public void setAccepte(List<String> accepte) {
		// TODO Auto-generated method stub
		this.accepte=accepte;
	}

	
	public List<String> getAccepte() {
		// TODO Auto-generated method stub
		return accepte;
	}

	
	public void setAttente(List<String> attente) {
		// TODO Auto-generated method stub
		this.attente=attente;
	}

	
	public List<String> getAttente() {
		// TODO Auto-generated method stub
		return attente;
	}

	
	public void setRefuse(List<String> refuse) {
		// TODO Auto-generated method stub
		this.refuse=refuse;
	}

	
	public List<String> getRefuse() {
		// TODO Auto-generated method stub
		return refuse;
	}
	

	/*@Override
	public List<Observateur> getListPompierCandidat() {
		// TODO Auto-generated method stub
		return ListPompierCandidat;
	}
	
	@Override
	public void inscription(Observateur o) {
		
		ListPompierCandidat.add(o);
		
	}

	@Override
	public void desincription(Observateur o) {
		
		ListPompierCandidat.remove(o);
		
	}

	@Override
	public void notifier() {
		
	     {
             for(int i=0;i<ListPompierCandidat.size();i++)
             {
                     Observateur o = ListPompierCandidat.get(i);
                     o.actualiser(this);
             }
     }
		
		
	}

*/

	

}
