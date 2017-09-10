package io.ebean;

/**
 * Used to define the transactional scope for executing a method. Matches the
 * types defined in the EJB TransactionAttributeType.
 * <p>
 * Used with the Transactional annotation and TxScope with
 * <ul>
 *   <li>Ebean execute(TxScope, Runnable)</li>
 *   <li>Ebean executeCall(TxScope, Callable)</li>
 * </ul>
 * </p>
 */
public enum TxType {

  /**
   * Uses an existing transaction and if none exists will starts a new
   * Transaction. This is the default.
   */
  REQUIRED,

  /**
   * A transaction MUST already have been started. Throws
   * TransactionRequiredException.
   */
  MANDATORY,

  /**
   * Uses the existing transaction if one exists, otherwise the method does not
   * run with a transaction. Used this with caution.
   */
  SUPPORTS,

  /**
   * Always start a new transaction. Suspend an existing once if required.
   */
  REQUIRES_NEW,

  /**
   * Suspends an existing transaction if required. Method runs without a
   * transaction.
   */
  NOT_SUPPORTED,

  /**
   * If there is an existing transaction throws an Exception. Method runs
   * without a transaction.
   */
  NEVER
}
