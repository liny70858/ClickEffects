package com.liam.clickEffects.bloom.shape.distributor;


import com.liam.clickEffects.bloom.particle.BloomParticle;
import com.liam.clickEffects.bloom.shape.ParticleCircleShape;
import com.liam.clickEffects.bloom.shape.ParticleShape;

/**
 * @author SamLeung
 * @e-mail samlssplus@gmail.com
 * @github https://github.com/samlss
 * @description The circle shape distributor for all particles.
 */
public class CircleShapeDistributor extends ParticleShapeDistributor {
    @Override
    public ParticleShape getShape(BloomParticle particle) {
        return new ParticleCircleShape(particle.getInitialX(), particle.getInitialY(), particle.getRadius());
    }
}
