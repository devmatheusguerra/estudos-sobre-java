package bytebank;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Extrato {
	private LocalDateTime dataEHora;
	private String transacao;
	private double valor;
	
	public Extrato(String transacao, double valor)
	{
		this.dataEHora = LocalDateTime.now();
		this.transacao = transacao;
		this.valor = valor;
		
	}

	public LocalDateTime getDataEHora() {
		return dataEHora;
	}
	
	public String getDataEHoraFormatada() {
		Locale brasil = new Locale(""); 
		DateTimeFormatter dtf = new DateTimeFormatter();
		this.dataEHora.format();
		
	}


	public String getTransacao() {
		return transacao;
	}

	public double getValor() {
		return valor;
	}


	
	
}
