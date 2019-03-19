package org.dogethereum.agents.contract;

import org.web3j.protocol.Web3j;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;

/**
 * Extends autogenerated SyscoinToken to be able to get UnlockRequest events synchronically
 * @author Catalina Juarros
 */
public class SyscoinTokenExtended extends SyscoinToken {

    protected SyscoinTokenExtended(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SyscoinTokenExtended load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SyscoinTokenExtended(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }


}
