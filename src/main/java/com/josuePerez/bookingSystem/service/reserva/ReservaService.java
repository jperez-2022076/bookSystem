package com.josuePerez.bookingSystem.service.reserva;

import com.josuePerez.bookingSystem.dto.ReservaResponseDto;
import com.josuePerez.bookingSystem.model.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> findAll();
    Reserva findById(String id);
    Reserva save(Reserva reserva);
    Reserva update(String id, Reserva reserva);
    void deleteById(String id);
    ReservaResponseDto getReservaById(String reservaId);
}
