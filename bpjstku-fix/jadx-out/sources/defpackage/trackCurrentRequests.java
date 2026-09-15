package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class trackCurrentRequests extends setImagePipeline {
    private final ProcessingRequest<?, byte[]> TuitionPaymentFragmentbindingInflater1;
    private final ProcessingNodeExternalSyntheticLambda7 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ProcessingNodeExternalSyntheticLambda6<?> b;

    /* synthetic */ trackCurrentRequests(retryRequest retryrequest, String str, ProcessingNodeExternalSyntheticLambda6 processingNodeExternalSyntheticLambda6, ProcessingRequest processingRequest, ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7, byte b2) {
        this(retryrequest, str, processingNodeExternalSyntheticLambda6, processingRequest, processingNodeExternalSyntheticLambda7);
    }

    private trackCurrentRequests(retryRequest retryrequest, String str, ProcessingNodeExternalSyntheticLambda6<?> processingNodeExternalSyntheticLambda6, ProcessingRequest<?, byte[]> processingRequest, ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = retryrequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = processingNodeExternalSyntheticLambda6;
        this.TuitionPaymentFragmentbindingInflater1 = processingRequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = processingNodeExternalSyntheticLambda7;
    }

    @Override // defpackage.setImagePipeline
    public final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.setImagePipeline
    public final String TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.setImagePipeline
    final ProcessingNodeExternalSyntheticLambda6<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }

    @Override // defpackage.setImagePipeline
    final ProcessingRequest<?, byte[]> b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setImagePipeline
    public final ProcessingNodeExternalSyntheticLambda7 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", transportName=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", transformer=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", encoding=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setImagePipeline)) {
            return false;
        }
        setImagePipeline setimagepipeline = (setImagePipeline) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(setimagepipeline.TuitionPaymentFragmentbindingInflater1()) && this.b.equals(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) && this.TuitionPaymentFragmentbindingInflater1.equals(setimagepipeline.b()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(setimagepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    static final class b extends setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private ProcessingNodeExternalSyntheticLambda7 TuitionPaymentFragmentbindingInflater1;
        private ProcessingNodeExternalSyntheticLambda6<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ProcessingRequest<?, byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private retryRequest b;

        b() {
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryRequest retryrequest) {
            if (retryrequest == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.b = retryrequest;
            return this;
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            return this;
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(ProcessingNodeExternalSyntheticLambda6<?> processingNodeExternalSyntheticLambda6) {
            if (processingNodeExternalSyntheticLambda6 == null) {
                throw new NullPointerException("Null event");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = processingNodeExternalSyntheticLambda6;
            return this;
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ProcessingRequest<?, byte[]> processingRequest) {
            if (processingRequest == null) {
                throw new NullPointerException("Null transformer");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = processingRequest;
            return this;
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7) {
            if (processingNodeExternalSyntheticLambda7 == null) {
                throw new NullPointerException("Null encoding");
            }
            this.TuitionPaymentFragmentbindingInflater1 = processingNodeExternalSyntheticLambda7;
            return this;
        }

        @Override // setImagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final setImagePipeline TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            String string;
            if (this.b != null) {
                string = "";
            } else {
                string = " transportContext";
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" transportName");
                string = sb.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" event");
                string = sb2.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" transformer");
                string = sb3.toString();
            }
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" encoding");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new trackCurrentRequests(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, (byte) 0);
        }
    }
}
