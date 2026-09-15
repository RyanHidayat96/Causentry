package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() { // from class: androidx.datastore.preferences.protobuf.MutabilityOracle.1
        @Override // androidx.content.preferences.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
