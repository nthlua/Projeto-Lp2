package Projeto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TutorTest {

	Tutor t;

	@Before
	public void testTutor() {
		t = new Tutor("Son Goku", "13", 5, "40028922", "songoku@dbs.com", "Prog2", 3);
	}

	@Test
	public void testGetMatricula() {
		assertEquals("13", t.getMatricula());
	}

	@Test
	public void testGetNota() {
		assertEquals(4, t.getNota());
	}

	@Test
	public void testSetNota() {
		t.setNota(5);
		assertEquals(5, t.getNota());
	}

	@Test
	public void testToString() {
		assertEquals("13 - Son Goku - 5 - 40028922 - songoku@dbs.com", t.toString());
	}

	@Test
	public void testEqualsObject() {

		Tutor s = new Tutor("Son Goku", "13", 5, "40028922", "songoku@dbs.com", "Prog2", 3);

		assertTrue(s.equals(t));
	}

	@Test
	public void testVerificaDisciplinas() {
		String Disciplina = "Prog2";
		String Disciplina2 = "C2";
		
		t.disciplinasTutor(t.getDisciplina());
		assertTrue(t.verificaDisciplinas(Disciplina));
		
		assertFalse(t.verificaDisciplinas(Disciplina2));
	}

	@Test
	public void testGetProficiencia() {
		assertEquals(3, t.getProficiencia());
	}

	@Test
	public void testSetProficiencia() {
		t.setProficiencia(6);
		
		assertEquals(6, t.getProficiencia());
	}

	@Test
	public void testGetDinheiro() {
		assertEquals(0, t.getDinheiro());
	}

	@Test
	public void testSetDinheiro() {
		t.setDinheiro(50);
		assertEquals(50, t.getDinheiro());
	}

	@Test
	public void testGetDisciplina() {
		assertEquals("Prog2", t.getDisciplina());
	}

}
