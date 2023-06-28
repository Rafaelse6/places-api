package br.com.rafaelsantos.placeservice.web;

import br.com.rafaelsantos.placeservice.api.PlaceResponse;
import br.com.rafaelsantos.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
