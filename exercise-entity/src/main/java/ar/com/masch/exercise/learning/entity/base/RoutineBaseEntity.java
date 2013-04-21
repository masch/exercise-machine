package ar.com.masch.exercise.learning.entity.base;

import java.util.List;

public class RoutineBaseEntity extends NameBaseEntity {
	
	private List<ExerciseBaseEntity> exercisesBookEntitiesList;
	
	public List<ExerciseBaseEntity> getExercisesBookEntitiesList() {
		return exercisesBookEntitiesList;
	}
	
	public void setExercisesBookEntitiesList(
			List<ExerciseBaseEntity> exercisesBookEntitiesList) {
		this.exercisesBookEntitiesList = exercisesBookEntitiesList;
	}

}