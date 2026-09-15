package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
final class NewInstanceSchemaLite implements NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.NewInstanceSchema
    public final Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
