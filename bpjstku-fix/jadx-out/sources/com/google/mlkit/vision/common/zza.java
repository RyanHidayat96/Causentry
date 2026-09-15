package com.google.mlkit.vision.common;

/* JADX INFO: loaded from: classes6.dex */
final class zza extends PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PointF3D)) {
            return false;
        }
        PointF3D pointF3D = (PointF3D) obj;
        return Float.floatToIntBits(this.zza) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(pointF3D.getZ());
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza);
        return ((((iFloatToIntBits ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc);
    }

    public final String toString() {
        float f = this.zza;
        float f2 = this.zzb;
        float f3 = this.zzc;
        StringBuilder sb = new StringBuilder("PointF3D{x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append("}");
        return sb.toString();
    }

    zza(float f, float f2, float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.zzc;
    }
}
