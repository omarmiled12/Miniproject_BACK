package com.omar.tvs.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomTv", types = { Tv.class })

public interface TvProjection {
	public String getNomTv();
}
