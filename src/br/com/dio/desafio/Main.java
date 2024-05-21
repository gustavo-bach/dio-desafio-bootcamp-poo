package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		// Cursos
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Java Iniciante");
		curso1.setCargaHoraria(12);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JS");
		curso2.setDescricao("JS Iniciante");
		curso2.setCargaHoraria(10);
		
		// Mentoria
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Java");
		mentoria.setDescricao("Tire suas dúvidas");
		mentoria.setData(LocalDate.now());
		
		
		// Bootcamp
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		// Devs
		
		Dev devGustavo = new Dev();
		devGustavo.setNome("Gustavo");
		devGustavo.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de Gustavo: " + devGustavo.getConteudosInscritos());
		devGustavo.progredir();
		System.out.println("Conteúdos concluidos de Gustavo: " + devGustavo.getConteudosConcluidos());
		System.out.println("XP: " + devGustavo.calcularXp());
		
		System.out.println("-------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos de João: " + devJoao.getConteudosConcluidos());
		
	}

}