package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
