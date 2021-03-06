package ar.com.masch.exercise.learning.repository.base;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.masch.exercise.learning.entity.base.ExerciseBaseEntity;
import ar.com.masch.exercise.learning.repository.CRUDRepositoryBaseTest;
import ar.com.masch.exercise.learning.repository.ExerciseBaseRepository;

public class ExerciseBaseRepositoryTest extends CRUDRepositoryBaseTest<ExerciseBaseEntity> {

	@Autowired
	private ExerciseBaseRepository exerciseBaseRepository;	
	
	@Override
	public void fillElementsSamples() {
		ArrayList<ExerciseBaseEntity> elementsSamples = new ArrayList<ExerciseBaseEntity>();
		
		for (int i = 0; i < 5; ++i) {
			ExerciseBaseEntity exerciseBaseEntity1 = new ExerciseBaseEntity(null, 1, i, "exerciseBaseName" + i, "pattern" + i);
			ExerciseBaseEntity exerciseBaseEntity2 = new ExerciseBaseEntity(null, 1, i+1, "exerciseBaseName" + i+1, "pattern" + i+1);
			
			elementsSamples.add(exerciseBaseEntity1);
			elementsSamples.add(exerciseBaseEntity2);
			
			//Creo 5 elementos con level 2 para buscarlos despues
			//elementsSamplesByLevelBase1.add(exerciseBaseEntity2);
		}

		this.addSamples(elementsSamples);
		//this.addSamples(elementsSamplesByLevelBase1);
		
	}

	@Override
	public void searchElements() {
		
		ArrayList<ExerciseBaseEntity> elementsSearchedByName = new ArrayList<ExerciseBaseEntity>();
		
		//Find By Name
		for (ExerciseBaseEntity exerciseBaseEntity : this.getElementsSamples()) {
			ExerciseBaseEntity elementSearchedByName = this.exerciseBaseRepository.findByName(exerciseBaseEntity.getName());
			assertNotNull(elementSearchedByName);
			elementsSearchedByName.add(elementSearchedByName);
		}
		this.addSearched(elementsSearchedByName);
		
		//Find By Level
		/*List<ExerciseBaseEntity> elementSearchedByLevel = this.exerciseBaseRepository.findByLevelBaseEntityOrderByNameAsc(levelBaseEntity2);
		this.addSearched((ArrayList<ExerciseBaseEntity>) elementSearchedByLevel);*/
		
	}
	
	@Override
	public void assertValues(ExerciseBaseEntity obj1, ExerciseBaseEntity obj2) {
		super.assertNotEqualsValuesBase(obj1, obj2);
		
		//assertEquals(obj1.getId(), obj2.getId());
		assertEquals(obj1.getName(), obj2.getName());
		assertEquals(obj1.getType(), obj2.getType());
		assertEquals(obj1.getPositionOrder(), obj2.getPositionOrder());
		assertEquals(obj1.getPatternFileName(), obj2.getPatternFileName());
		
		//this.levelBaseRepositoryTest.assertEqualsValuesBase(obj1.getLevelBaseEntity(), obj2.getLevelBaseEntity());
		
	}

	//@Test
	public void doTest() {

		super.doTest(this.exerciseBaseRepository);

	}	
	
}
