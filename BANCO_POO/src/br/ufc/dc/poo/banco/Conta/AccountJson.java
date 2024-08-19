package br.ufc.dc.poo.banco.Conta;
import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Vector;

public class AccountJson implements IRepositorioConta {
    private Gson gson = new Gson();
    private Vector<ContaAbstrata> contas;
    
    public AccountJson() {
        try {
			load();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    public void inserir(ContaAbstrata conta) {
        contas.add(conta);
        saveToFile();
    }


    public void remover(String numero) {
		for( int i = 0; i <contas.size(); i++) {
			if(contas.equals(numero)) {
			contas.remove(i);
		}
	}
}

	public ContaAbstrata procurar(String numero) {
		boolean achou = false;
		for( int i = 0; i <contas.size(); i++) {
			if(contas.equals(numero)) {
			achou = true;
			return contas.get(i);
		}
	}
		return null;
}


    public ContaAbstrata[] listar() {
        return contas.toArray(new ContaAbstrata[0]);
    }

    public int tamanho() {
        return contas.size();
    }

    private void load() throws FileNotFoundException {
        FileReader reader;
		try {
			reader = new FileReader("contas.json");
			Type type = new TypeToken<Vector<ContaAbstrata>>() {}.getType();
	        Vector<ContaAbstrata> loadedContas = gson.fromJson(reader, type);
	        if (loadedContas != null) {
	            contas.addAll(loadedContas);
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         
    }

    private void saveToFile() {
       
		try {
			FileWriter writer = new FileWriter("contas.json");
			gson.toJson(contas, writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	
}