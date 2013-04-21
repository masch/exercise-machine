package ar.com.masch.exercise.learning.entity.book;

import java.util.List;

import ar.com.masch.exercise.learning.entity.base.ExerciseBaseEntity;
import ar.com.masch.exercise.learning.entity.base.NameBaseEntity;

public class ChapterBookEntity extends NameBaseEntity {
	
	private List<ExerciseBaseEntity> exercisesBookList;
	
	public List<ExerciseBaseEntity> getExercisesBookList() {
		return exercisesBookList;
	}
	
	public void setExercisesBookList(List<ExerciseBaseEntity> exercisesBookList) {
		this.exercisesBookList = exercisesBookList;
	}

}
