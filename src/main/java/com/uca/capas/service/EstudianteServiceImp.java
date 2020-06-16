package com.uca.capas.service;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;
import com.uca.capas.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EstudianteServiceImp implements EstudianteService{

    @Autowired
    //EstudianteDAO estudianteDAO;
    EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() throws DataAccessException{
        //return estudianteDAO.findAll();  //Labo 6
        //return estudianteRepository.findAll();  //Labo 7
        return estudianteRepository.ShowAll();
    }

    @Override
    public Estudiante findOne(Integer code) throws DataAccessException{
        //return estudianteDAO.findOne(code);   //Labo 6
        return estudianteRepository.getOne(code);
    }

    @Override
    public void save(Estudiante estudiante) throws DataAccessException {
        //estudianteDAO.save(estudiante);  //Labo 6
        estudianteRepository.save(estudiante);
    }

    @Override
    public void delete(Integer idestudiante) throws DataAccessException {
        //estudianteDAO.delete(idestudiante);  //Labo 6
        estudianteRepository.deleteById(idestudiante);
    }

    @Override
    public List<Estudiante> FiltrarPor(String cadena) throws DataAccessException {
        //return estudianteRepository.findByNombre(cadena);   //Labo 7
        return estudianteRepository.ShowByName(cadena);
    }

    @Override
    public List<Estudiante> startwith(String cadena) throws DataAccessException {

        return estudianteRepository.findByApellidoStartingWith(cadena);
    }

}
