package com.liam.clickEffects.bloom.shape.distributor;


import com.liam.clickEffects.bloom.particle.BloomParticle;
import com.liam.clickEffects.bloom.shape.ParticleRectShape;
import com.liam.clickEffects.bloom.shape.ParticleShape;

/**
 * @author SamLeung
 * @e-mail samlssplus@gmail.com
 * @github https://github.com/samlss
 * @description The rect shape distributor without rebound corners for all particles.
 */
public class RectShapeDistributor extends ParticleShapeDistributor {

    @Override
    public ParticleShape getShape(BloomParticle particle) {
        return new ParticleRectShape(particle.getInitialX(), particle.getInitialY(), particle.getRadius());
    }
}
