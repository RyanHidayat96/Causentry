package androidx.content.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
final class OneofInfo {
    private final Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f322id;
    private final Field valueField;

    public OneofInfo(int i, Field field, Field field2) {
        this.f322id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public final int getId() {
        return this.f322id;
    }

    public final Field getCaseField() {
        return this.caseField;
    }

    public final Field getValueField() {
        return this.valueField;
    }
}
