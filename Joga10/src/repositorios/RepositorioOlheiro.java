package repositorios;
package repositorios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

import classesPrincipais.Olheiro;
import negocios.ControladorOlheiro;

public class RepositorioOlheiro {

	public static RepositorioTime getInstancia() {
		if (instancia == null) {
			instancia = lerDoArquivo();
		}
		return instancia;
	}
}
