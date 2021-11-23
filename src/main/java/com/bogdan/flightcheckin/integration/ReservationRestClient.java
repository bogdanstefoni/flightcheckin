package com.bogdan.flightcheckin.integration;

import com.bogdan.flightcheckin.integration.dto.Reservation;
import com.bogdan.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

     Reservation findReservation(Long id);

     Reservation updateReservation(ReservationUpdateRequest request);


}
