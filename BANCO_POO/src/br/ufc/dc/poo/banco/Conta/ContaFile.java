package br.ufc.dc.poo.banco.Conta;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ContaFile {
	
	public void CriaArquivo( String Path, String NomeArquivo){
		File diretorio = new File(Path);
		if (!diretorio.isDirectory()) {
			diretorio.mkdir();
			}
		
		try {
			File arquivo = new File(diretorio, "PlanoAula.txt");
			FileWriter gravador = new FileWriter(arquivo);
			gravador.close();
			} catch (IOException ioe) {
			ioe.printStackTrace();
			}
	}
	
	public void EscreveArquivo( String Path, String NomeArquivo, char Conteudo){
		File diretorio = new File(Path);
		if (!diretorio.isDirectory()) {
			diretorio.mkdir();
			}
		
		try {
			File arquivo = new File(diretorio, "PlanoAula.txt");
			FileOutputStream gravador = new FileOutputStream(arquivo);
			gravador.write(Conteudo);
			gravador.close();

			} catch (IOException ioe) {
			ioe.printStackTrace();
			}
	}
}
