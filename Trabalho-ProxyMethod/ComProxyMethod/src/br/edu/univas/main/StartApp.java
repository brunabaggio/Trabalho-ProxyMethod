package br.edu.univas.main;

import br.edu.univas.proxy.ImagemP;
import br.edu.univas.proxy.img;
import br.edu.univas.proxy.desenho;

	public class StartApp {
		public static void main(String[] args) {
			
			desenho ds = new ImagemP ("BTS Symbol");
			
			ds.desenha();
			System.out.println();
			
			ds.desenha();
			System.out.println();
		}
}