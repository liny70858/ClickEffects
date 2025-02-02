package com.liam.clickEffects.bloom.shape.distributor;


import com.liam.clickEffects.bloom.particle.BloomParticle;
import com.liam.clickEffects.bloom.shape.ParticleShape;
import com.liam.clickEffects.bloom.shape.ParticleStarShape;

/**
 * @author SamLeung
 * @e-mail samlssplus@gmail.com
 * @github https://github.com/samlss
 * @description The star shape distributor for all particles.
 */
public class StarShapeDistributor extends ParticleShapeDistributor {
    @Override
    public ParticleShape getShape(BloomParticle particle) {
        return new ParticleStarShape(particle.getInitialX(), particle.getInitialY(), particle.getRadius());
    }
}
