package com.backend.service.Rota;

import com.backend.repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RotaServiceImpl extends RotaService {
    @Autowired
    private RotaRepository rotaRepository;
}