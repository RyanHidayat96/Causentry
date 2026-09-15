package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ExperimentalPersistentRecording extends FileOutputOptions {
    private static final UriMatcher TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        TuitionPaymentFragmentbindingInflater1 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public ExperimentalPersistentRecording(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
    }

    @Override // defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        Uri uri = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && TuitionPaymentFragmentbindingInflater1.match(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[PHI: r5
  0x0039: PHI (r5v6 android.net.Uri) = (r5v2 android.net.Uri), (r5v1 android.net.Uri) binds: [B:15:0x0035, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getContentResolver();
        Uri uriLookupContact = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault;
        int iMatch = TuitionPaymentFragmentbindingInflater1.match(uriLookupContact);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            if (uriLookupContact == null) {
                inputStreamOpenContactPhotoInputStream = null;
            } else {
                inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
            }
        } else {
            if (iMatch != 2) {
                if (iMatch == 3) {
                    inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
                } else if (iMatch != 4) {
                    throw new IllegalStateException("Invalid uri: ".concat(String.valueOf(uriLookupContact)));
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStreamOpenContactPhotoInputStream), Picasso.LoadedFrom.DISK);
    }
}
