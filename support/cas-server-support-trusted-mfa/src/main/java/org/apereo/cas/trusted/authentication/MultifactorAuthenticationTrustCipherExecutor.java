package org.apereo.cas.trusted.authentication;

import org.apereo.cas.util.cipher.BaseStringCipherExecutor;

/**
 * This is {@link MultifactorAuthenticationTrustCipherExecutor}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class MultifactorAuthenticationTrustCipherExecutor extends BaseStringCipherExecutor {
    public MultifactorAuthenticationTrustCipherExecutor(final String secretKeyEncryption, 
                                                        final String secretKeySigning) {
        super(secretKeyEncryption, secretKeySigning);
    }
}
