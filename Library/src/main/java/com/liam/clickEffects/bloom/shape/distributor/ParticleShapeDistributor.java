package com.liam.clickEffects.bloom.shape.distributor;


import com.liam.clickEffects.bloom.particle.BloomParticle;
import com.liam.clickEffects.bloom.shape.ParticleShape;

/**
 * @author SamLeung
 * @e-mail samlssplus@gmail.com
 * @github https://github.com/samlss
 * @description The bloom shape distributor.
 */
public abstract class ParticleShapeDistributor {
    public abstract ParticleShape getShape(BloomParticle particle);
}
