package br.com.rafaelsantos.placeservice.domain;

import br.com.rafaelsantos.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    private PlaceRepository placeRepository;

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), placeRequest.state(),
                placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
