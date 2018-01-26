package com.minsx.core.system.service.api;

import com.minsx.core.common.entity.ordinary.Auth;
import org.springframework.http.ResponseEntity;

/**
 * AuthService
 * Created by Joker on 2017/8/30.
 */
public interface AuthService extends MinsxEntityService {

    ResponseEntity<?> getAuths();

    ResponseEntity<?> saveAuths(Auth auth);
}
