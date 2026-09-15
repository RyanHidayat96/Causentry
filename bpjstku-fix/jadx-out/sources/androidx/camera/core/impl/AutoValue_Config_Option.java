package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f304id;
    private final Object token;
    private final Class<T> valueClass;

    AutoValue_Config_Option(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f304id = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.valueClass = cls;
        this.token = obj;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final String getId() {
        return this.f304id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final Class<T> getValueClass() {
        return this.valueClass;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final Object getToken() {
        return this.token;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.f304id);
        sb.append(", valueClass=");
        sb.append(this.valueClass);
        sb.append(", token=");
        sb.append(this.token);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (!this.f304id.equals(option.getId()) || !this.valueClass.equals(option.getValueClass())) {
            return false;
        }
        Object obj2 = this.token;
        if (obj2 == null) {
            if (option.getToken() != null) {
                return false;
            }
        } else if (!obj2.equals(option.getToken())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f304id.hashCode();
        int iHashCode2 = this.valueClass.hashCode();
        Object obj = this.token;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }
}
