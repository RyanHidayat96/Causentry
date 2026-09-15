package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class checkOnImageCaptured extends onProcessFailure {
    private final Integer INotificationSideChannel;
    private final String TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f354a;
    private final String asBinder;
    private final String asInterface;
    private final String b;
    private final String d;
    private final String g;
    private final String onTransact;

    /* synthetic */ checkOnImageCaptured(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte b) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    private checkOnImageCaptured(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.INotificationSideChannel = num;
        this.asInterface = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.onTransact = str4;
        this.g = str5;
        this.asBinder = str6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str7;
        this.f354a = str8;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str9;
        this.d = str10;
        this.b = str11;
    }

    @Override // defpackage.onProcessFailure
    public final Integer INotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    @Override // defpackage.onProcessFailure
    public final String d() {
        return this.asInterface;
    }

    @Override // defpackage.onProcessFailure
    public final String b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.onProcessFailure
    public final String TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.onProcessFailure
    public final String cancel() {
        return this.onTransact;
    }

    @Override // defpackage.onProcessFailure
    public final String asInterface() {
        return this.g;
    }

    @Override // defpackage.onProcessFailure
    public final String g() {
        return this.asBinder;
    }

    @Override // defpackage.onProcessFailure
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.onProcessFailure
    public final String a() {
        return this.f354a;
    }

    @Override // defpackage.onProcessFailure
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.onProcessFailure
    public final String asBinder() {
        return this.d;
    }

    @Override // defpackage.onProcessFailure
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.INotificationSideChannel);
        sb.append(", model=");
        sb.append(this.asInterface);
        sb.append(", hardware=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", device=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", product=");
        sb.append(this.onTransact);
        sb.append(", osBuild=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.asBinder);
        sb.append(", fingerprint=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", locale=");
        sb.append(this.f354a);
        sb.append(", country=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", mccMnc=");
        sb.append(this.d);
        sb.append(", applicationBuild=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onProcessFailure)) {
            return false;
        }
        onProcessFailure onprocessfailure = (onProcessFailure) obj;
        Integer num = this.INotificationSideChannel;
        if (num == null) {
            if (onprocessfailure.INotificationSideChannel() != null) {
                return false;
            }
        } else if (!num.equals(onprocessfailure.INotificationSideChannel())) {
            return false;
        }
        String str = this.asInterface;
        if (str == null) {
            if (onprocessfailure.d() != null) {
                return false;
            }
        } else if (!str.equals(onprocessfailure.d())) {
            return false;
        }
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        if (str2 == null) {
            if (onprocessfailure.b() != null) {
                return false;
            }
        } else if (!str2.equals(onprocessfailure.b())) {
            return false;
        }
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str3 == null) {
            if (onprocessfailure.TuitionPaymentFragmentbindingInflater1() != null) {
                return false;
            }
        } else if (!str3.equals(onprocessfailure.TuitionPaymentFragmentbindingInflater1())) {
            return false;
        }
        String str4 = this.onTransact;
        if (str4 == null) {
            if (onprocessfailure.cancel() != null) {
                return false;
            }
        } else if (!str4.equals(onprocessfailure.cancel())) {
            return false;
        }
        String str5 = this.g;
        if (str5 == null) {
            if (onprocessfailure.asInterface() != null) {
                return false;
            }
        } else if (!str5.equals(onprocessfailure.asInterface())) {
            return false;
        }
        String str6 = this.asBinder;
        if (str6 == null) {
            if (onprocessfailure.g() != null) {
                return false;
            }
        } else if (!str6.equals(onprocessfailure.g())) {
            return false;
        }
        String str7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str7 == null) {
            if (onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                return false;
            }
        } else if (!str7.equals(onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
            return false;
        }
        String str8 = this.f354a;
        if (str8 == null) {
            if (onprocessfailure.a() != null) {
                return false;
            }
        } else if (!str8.equals(onprocessfailure.a())) {
            return false;
        }
        String str9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str9 == null) {
            if (onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                return false;
            }
        } else if (!str9.equals(onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return false;
        }
        String str10 = this.d;
        if (str10 == null) {
            if (onprocessfailure.asBinder() != null) {
                return false;
            }
        } else if (!str10.equals(onprocessfailure.asBinder())) {
            return false;
        }
        String str11 = this.b;
        if (str11 == null) {
            if (onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                return false;
            }
        } else if (!str11.equals(onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.INotificationSideChannel;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.asInterface;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.onTransact;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.g;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.asBinder;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.f354a;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.d;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.b;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ (str11 != null ? str11.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private String INotificationSideChannel;
        private String TuitionPaymentFragmentbindingInflater1;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f355a;
        private String asBinder;
        private String asInterface;
        private String b;
        private Integer cancelAll;
        private String d;
        private String g;

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(Integer num) {
            this.cancelAll = num;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 a(String str) {
            this.asBinder = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 notify(String str) {
            this.INotificationSideChannel = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface(String str) {
            this.f355a = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 d(String str) {
            this.asInterface = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 asBinder(String str) {
            this.d = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 g(String str) {
            this.g = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            this.b = str;
            return this;
        }

        @Override // onProcessFailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final onProcessFailure TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new checkOnImageCaptured(this.cancelAll, this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.INotificationSideChannel, this.f355a, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.g, this.b, (byte) 0);
        }
    }
}
