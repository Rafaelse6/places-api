package br.com.rafaelsantos.placeservice.domain;

import reactor.core.publisher.Mono;

public class PlaceService {

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    private PlaceRepository placeRepository;

    public Mono<Place> create(Place place) {
        return placeRepository.save(place);
    }
}
