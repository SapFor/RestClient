package objectsTemplates;

import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Created with Eclipse.
 * Author : Caroline Chabert
 * Class to get and set sessions data hosted by the server (cloning of data)
 * 
 */

@XmlRootElement
public class StageConcret {

	private int directeur;
	private String uv;
	private Calendar date;
	private String lieu;
	private String infos;
	private List<String> candidats;
	private List<String> accepte;
	private List<String> attente;
	private List<String> refuse;
	
	/*
	 * ID director of the session
	 */
	public void setDirecteur(int directeur) { this.directeur = directeur; }
	public int getDirecteur() { return directeur; }
	
	/*
	 * UV of the session
	 */
	public void setUV(String uv) { this.uv = uv; }
	public String getUV() { return uv; }
	
	/*
	 * Date of the session
	 */
	public void setDate(Calendar date) { this.date = date; }
	public String getDate() {
		 String currentDate = date.get(Calendar.DAY_OF_MONTH) +
				 				"/" + date.get(Calendar.MONTH) +
				 				"/" + date.get(Calendar.YEAR);
		 return currentDate;
	}
	
	/*
	 * Place of the session
	 */
	public void setLieu(String lieu) { this.lieu = lieu; }
	public String getLieu() { return lieu; }
	
	/*
	 * Informations of the session
	 */
	public void setInfos(String infos) { this.infos = infos; }
	public String getInfos() { return infos; }
	
	/*
	 * Complete list of candidates for the session
	 */
	public void setCandidats(List<String> candidats) { this.candidats = candidats; }
	public List<String> getCandidats() { return candidats; }
	
	/*
	 * List of accepted candidates
	 */
	public void setAccepte(List<String> accepte) { this.accepte = accepte; }
	public List<String> getAccepte() { return accepte; }
	
	/*
	 * List of pending candidates
	 */
	public void setAttente(List<String> attente) { this.attente = attente; }
	public List<String> getAttente() { return attente; }
	
	/*
	 * List of refused candidates
	 */
	public void setRefuse(List<String> refuse) { this.refuse = refuse; }
	public List<String> getRefuse() { return refuse; }


}
