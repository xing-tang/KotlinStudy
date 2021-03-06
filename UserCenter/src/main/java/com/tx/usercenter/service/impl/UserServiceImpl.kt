package com.tx.usercenter.service.impl

import com.tx.baselibrary.data.protocol.BaseResp
import com.tx.baselibrary.rx.BaseException
import com.tx.usercenter.data.repository.UserRepository
import com.tx.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
        return repository.register(mobile, pwd, verifyCode)
                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
                    override fun call(t: BaseResp<String>): Observable<Boolean> {
                        if (t.status != 0) {
                            return Observable.error(BaseException(t.status, t.message))
                        }
                        return Observable.just(true)
                    }
                })
    }


}