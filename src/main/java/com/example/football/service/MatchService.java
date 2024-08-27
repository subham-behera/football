package com.example.football.service;

import com.example.football.model.Match;
import com.example.football.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }

    public Match getMatchByid(Long id){
        return matchRepository.findById(id).orElse(null);
    }

    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }

    public void deleteMatch(Long id){
        matchRepository.deleteById(id);
    }
}
