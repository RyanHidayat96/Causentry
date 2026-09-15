package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
