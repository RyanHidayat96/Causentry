package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class onRemoveQueueItemAt extends onSeekTo implements Choreographer.FrameCallback {
    public previous TuitionPaymentFragmentbindingInflater1;
    public float d = 1.0f;
    private boolean asInterface = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1304a = 0;
    public float TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0.0f;
    private int asBinder = 0;
    public float b = -2.1474836E9f;
    public float TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2.1474836E9f;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    public final float b() {
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar == null) {
            return 0.0f;
        }
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - previousVar.onTransact) / (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 - this.TuitionPaymentFragmentbindingInflater1.onTransact);
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        float f4;
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        float f5 = 0.0f;
        if (previousVar == null) {
            return 0.0f;
        }
        if (this.d < 0.0f) {
            if (previousVar == null) {
                f4 = 0.0f;
            } else {
                f4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (f4 == 2.1474836E9f) {
                    f4 = previousVar.TuitionPaymentFragmentbindingInflater1;
                }
            }
            f2 = f4 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar2 == null) {
                f3 = 0.0f;
            } else {
                f3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (f3 == 2.1474836E9f) {
                    f3 = previousVar2.TuitionPaymentFragmentbindingInflater1;
                }
            }
            previous previousVar3 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar3 != null) {
                f5 = this.b;
                if (f5 == -2.1474836E9f) {
                    f5 = previousVar3.onTransact;
                }
            }
        } else {
            float f6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (previousVar == null) {
                f = 0.0f;
            } else {
                f = this.b;
                if (f == -2.1474836E9f) {
                    f = previousVar.onTransact;
                }
            }
            f2 = f6 - f;
            previous previousVar4 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar4 == null) {
                f3 = 0.0f;
            } else {
                f3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (f3 == 2.1474836E9f) {
                    f3 = previousVar4.TuitionPaymentFragmentbindingInflater1;
                }
            }
            previous previousVar5 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar5 != null) {
                f5 = this.b;
                if (f5 == -2.1474836E9f) {
                    f5 = previousVar5.onTransact;
                }
            }
        }
        return f2 / (f3 - f5);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar == null) {
            return 0L;
        }
        return (long) (((previousVar.TuitionPaymentFragmentbindingInflater1 - previousVar.onTransact) / previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 1000.0f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final void TuitionPaymentFragmentbindingInflater1(float f) {
        float f2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == f) {
            return;
        }
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        float f3 = 0.0f;
        if (previousVar == null) {
            f2 = 0.0f;
        } else {
            f2 = this.b;
            if (f2 == -2.1474836E9f) {
                f2 = previousVar.onTransact;
            }
        }
        previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar2 != null) {
            f3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (f3 == 2.1474836E9f) {
                f3 = previousVar2.TuitionPaymentFragmentbindingInflater1;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(f, f2, f3);
        this.f1304a = 0L;
        TuitionPaymentFragmentbindingInflater1();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        float f3 = previousVar == null ? -3.4028235E38f : previousVar.onTransact;
        previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
        float f4 = previousVar2 == null ? Float.MAX_VALUE : previousVar2.TuitionPaymentFragmentbindingInflater1;
        this.b = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(f, f3, f4);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(f2, f3, f4);
        TuitionPaymentFragmentbindingInflater1((int) onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, f, f2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.asInterface) {
            return;
        }
        this.asInterface = false;
        this.d = -this.d;
    }

    public final void a() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        float f = 0.0f;
        TuitionPaymentFragmentbindingInflater1(this.d < 0.0f);
        if (this.d >= 0.0f) {
            previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar != null) {
                f = this.b;
                if (f == -2.1474836E9f) {
                    f = previousVar.onTransact;
                }
            }
        } else {
            previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar2 != null) {
                f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (f == 2.1474836E9f) {
                    f = previousVar2.TuitionPaymentFragmentbindingInflater1;
                }
            }
        }
        TuitionPaymentFragmentbindingInflater1((int) f);
        this.f1304a = 0L;
        this.asBinder = 0;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void g() {
        float f;
        float f2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.f1304a = 0L;
        float f3 = 0.0f;
        if (this.d < 0.0f) {
            float f4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar == null) {
                f2 = 0.0f;
            } else {
                f2 = this.b;
                if (f2 == -2.1474836E9f) {
                    f2 = previousVar.onTransact;
                }
            }
            if (f4 == f2) {
                previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
                if (previousVar2 != null) {
                    f3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (f3 == 2.1474836E9f) {
                        f3 = previousVar2.TuitionPaymentFragmentbindingInflater1;
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f3;
                return;
            }
        }
        if (this.d < 0.0f) {
            return;
        }
        float f5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        previous previousVar3 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar3 == null) {
            f = 0.0f;
        } else {
            f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (f == 2.1474836E9f) {
                f = previousVar3.TuitionPaymentFragmentbindingInflater1;
            }
        }
        if (f5 == f) {
            previous previousVar4 = this.TuitionPaymentFragmentbindingInflater1;
            if (previousVar4 != null) {
                f3 = this.b;
                if (f3 == -2.1474836E9f) {
                    f3 = previousVar4.onTransact;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f3;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Choreographer.getInstance().removeFrameCallback(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        if (this.TuitionPaymentFragmentbindingInflater1 == null || !isRunning()) {
            return;
        }
        long j2 = this.f1304a;
        long j3 = j2 != 0 ? j - j2 : 0L;
        previous previousVar = this.TuitionPaymentFragmentbindingInflater1;
        float fAbs = j3 / (previousVar == null ? Float.MAX_VALUE : (1.0E9f / previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) / Math.abs(this.d));
        float f6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f7 = 0.0f;
        if (this.d < 0.0f) {
            fAbs = -fAbs;
        }
        float f8 = f6 + fAbs;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f8;
        previous previousVar2 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar2 == null) {
            f = 0.0f;
        } else {
            f = this.b;
            if (f == -2.1474836E9f) {
                f = previousVar2.onTransact;
            }
        }
        previous previousVar3 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar3 == null) {
            f2 = 0.0f;
        } else {
            f2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (f2 == 2.1474836E9f) {
                f2 = previousVar3.TuitionPaymentFragmentbindingInflater1;
            }
        }
        boolean zB = onSetRepeatMode.b(f8, f, f2);
        float f9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        previous previousVar4 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar4 == null) {
            f3 = 0.0f;
        } else {
            f3 = this.b;
            if (f3 == -2.1474836E9f) {
                f3 = previousVar4.onTransact;
            }
        }
        previous previousVar5 = this.TuitionPaymentFragmentbindingInflater1;
        if (previousVar5 == null) {
            f4 = 0.0f;
        } else {
            f4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (f4 == 2.1474836E9f) {
                f4 = previousVar5.TuitionPaymentFragmentbindingInflater1;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onSetRepeatMode.TuitionPaymentFragmentbindingInflater1(f9, f3, f4);
        this.f1304a = j;
        TuitionPaymentFragmentbindingInflater1();
        if (!zB) {
            if (getRepeatCount() != -1 && this.asBinder >= getRepeatCount()) {
                if (this.d < 0.0f) {
                    previous previousVar6 = this.TuitionPaymentFragmentbindingInflater1;
                    if (previousVar6 == null) {
                        f5 = 0.0f;
                    } else {
                        f5 = this.b;
                        if (f5 == -2.1474836E9f) {
                            f5 = previousVar6.onTransact;
                        }
                    }
                } else {
                    previous previousVar7 = this.TuitionPaymentFragmentbindingInflater1;
                    if (previousVar7 == null) {
                        f5 = 0.0f;
                    } else {
                        f5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (f5 == 2.1474836E9f) {
                            f5 = previousVar7.TuitionPaymentFragmentbindingInflater1;
                        }
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f5;
                Choreographer.getInstance().removeFrameCallback(this);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                b(this.d < 0.0f);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                this.asBinder++;
                if (getRepeatMode() == 2) {
                    this.asInterface = !this.asInterface;
                    this.d = -this.d;
                } else {
                    if (this.d < 0.0f) {
                        previous previousVar8 = this.TuitionPaymentFragmentbindingInflater1;
                        if (previousVar8 != null) {
                            f7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (f7 == 2.1474836E9f) {
                                f7 = previousVar8.TuitionPaymentFragmentbindingInflater1;
                            }
                        }
                    } else {
                        previous previousVar9 = this.TuitionPaymentFragmentbindingInflater1;
                        if (previousVar9 != null) {
                            f7 = this.b;
                            if (f7 == -2.1474836E9f) {
                                f7 = previousVar9.onTransact;
                            }
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f7;
                }
                this.f1304a = j;
            }
        }
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            float f10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            float f11 = this.b;
            if (f10 < f11 || f10 > this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f11), Float.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Float.valueOf(f10)));
            }
        }
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        b(this.d < 0.0f);
    }
}
