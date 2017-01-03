package ru.innopolis.uni.course3.ofedorova.controllers;

import ru.innopolis.uni.course3.ofedorova.dao.lectures.DAOForLecture;
import ru.innopolis.uni.course3.ofedorova.models.Lecture;

import java.util.Collection;

/**
 * Created by Olga on 22.12.2016.
 */
public class LectureController implements DAOForLecture {

    private DAOForLecture daoForLecture;

    public void setDaoForLecture(DAOForLecture daoForLecture) {
        this.daoForLecture = daoForLecture;
    }

    @Override
    public Collection<Lecture> values() {
        return this.daoForLecture.values();
    }

    @Override
    public int add(Lecture lecture) {
        return this.daoForLecture.add(lecture);
    }

    @Override
    public void edit(Lecture lecture) {
        this.daoForLecture.edit(lecture);
    }

    @Override
    public void delete(int id) {
        this.daoForLecture.delete(id);
    }

    @Override
    public Lecture get(int id) {
        return this.daoForLecture.get(id);
    }

    @Override
    public int generateId() {
        return this.daoForLecture.generateId();
    }
}
