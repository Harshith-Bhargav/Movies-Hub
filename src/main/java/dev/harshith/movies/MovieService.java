package dev.harshith.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRespository movieRespository;

    public List<Movie> allMovies(){
        return movieRespository.findAll();
    }
    public Optional<Movie> getSingleMovie(  String imdbId){
        return movieRespository.findMovieByImdbId(imdbId);
    }
}
