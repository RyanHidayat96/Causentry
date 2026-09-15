package defpackage;

import com.rd.animation.type.AnimationType;
import com.rd.animation.type.DropAnimation;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes4.dex */
public final class shutdownAsync {
    public boolean TuitionPaymentFragmentbindingInflater1;
    private AudioStats TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public AudioSpecBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public float TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private getInstancelambda0.TuitionPaymentFragmentbindingInflater1 b;
    private getInstancelambda0 g;

    public shutdownAsync(AudioStats audioStats, getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.g = new getInstancelambda0(tuitionPaymentFragmentbindingInflater1);
        this.b = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioStats;
    }

    /* JADX INFO: renamed from: shutdownAsync$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[AnimationType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[AnimationType.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public final void b() {
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        switch (AnonymousClass1.TuitionPaymentFragmentbindingInflater1[audioStats.b.ordinal()]) {
            case 1:
                this.b.b(null);
                break;
            case 2:
                TuitionPaymentFragmentbindingInflater1();
                break;
            case 3:
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                break;
            case 4:
                g();
                break;
            case 5:
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                break;
            case 6:
                a();
                break;
            case 7:
                asInterface();
                break;
            case 8:
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                break;
            case 9:
                asBinder();
                break;
            case 10:
                d();
                break;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.b == null) {
            getinstancelambda0.b = new getChannelCount(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.b.b(i2, i).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getSource(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(i2, i, i3, f).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void g() throws Throwable {
        int i;
        int i2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
        }
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        } else {
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats, i);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats, i);
            }
        }
        AudioStats audioStats2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats2 == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        } else {
            if (audioStats2.INotificationSideChannel == null) {
                audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats2.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats2, i2);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats2, i2);
            }
        }
        boolean z = i2 > i;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.g == null) {
            getinstancelambda0.g = new setChannelCount(getinstancelambda0.f948a);
        }
        setChannelCount setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.g.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, i3, z).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void a() throws Throwable {
        int i;
        int i2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
        } else {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        }
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        if (audioStats == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        } else {
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats, i);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats, i);
            }
        }
        AudioStats audioStats2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats2 != null) {
            if (audioStats2.INotificationSideChannel == null) {
                audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats2.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats2, i2);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats2, i2);
            }
        }
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.asBinder == null) {
            getinstancelambda0.asBinder = new setSource(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setBitrate(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(i2, i, i3, i4).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void asInterface() throws Throwable {
        int i;
        int i2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
        }
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        } else {
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats, i);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats, i);
            }
        }
        AudioStats audioStats2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats2 == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        } else {
            if (audioStats2.INotificationSideChannel == null) {
                audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats2.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats2, i2);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats2, i2);
            }
        }
        boolean z = i2 > i;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.d == null) {
            getinstancelambda0.d = new setSampleRate(getinstancelambda0.f948a);
        }
        setChannelCount setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.d.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, i3, z).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = setchannelcountTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        int i;
        int i2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
        } else {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        }
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        if (audioStats == null) {
            i3 = 0;
        } else {
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats, i);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats, i);
            }
            i3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        AudioStats audioStats2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats2 != null) {
            if (audioStats2.INotificationSideChannel == null) {
                audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats2.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats2, i2);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats2, i2);
            }
        }
        int i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelDefault;
        int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll;
        AudioStats audioStats3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats3.INotificationSideChannel == null) {
            audioStats3.INotificationSideChannel = Orientation.HORIZONTAL;
        }
        if (audioStats3.INotificationSideChannel != Orientation.HORIZONTAL) {
            i5 = i6;
        }
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.TuitionPaymentFragmentbindingInflater1 == null) {
            getinstancelambda0.TuitionPaymentFragmentbindingInflater1 = new DropAnimation(getinstancelambda0.f948a);
        }
        DropAnimation dropAnimationTuitionPaymentFragmentbindingInflater1 = getinstancelambda0.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j).TuitionPaymentFragmentbindingInflater1(i3, i4, (i7 * 3) + i5, i7 + i5, i7);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            dropAnimationTuitionPaymentFragmentbindingInflater1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            dropAnimationTuitionPaymentFragmentbindingInflater1.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dropAnimationTuitionPaymentFragmentbindingInflater1;
    }

    private void asBinder() throws Throwable {
        int i;
        int i2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        } else {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
        }
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        if (audioStats == null) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        } else {
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats, i);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats, i);
            }
        }
        AudioStats audioStats2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats2 != null) {
            if (audioStats2.INotificationSideChannel == null) {
                audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats2.INotificationSideChannel == Orientation.HORIZONTAL) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(audioStats2, i2);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(audioStats2, i2);
            }
        }
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.asInterface == null) {
            getinstancelambda0.asInterface = new setSourceFormat(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private void d() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getInstancelambda0 getinstancelambda0 = this.g;
        if (getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getSourceFormat(getinstancelambda0.f948a);
        }
        AudioSpecBuilder audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getinstancelambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(i2, i, i3, f).TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSpecBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
