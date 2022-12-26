/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.playground.architecture;
// Declare any non-default types here with import statements

public interface IAppDataAidlInterface extends android.os.IInterface
{
  /** Default implementation for IAppDataAidlInterface. */
  public static class Default implements com.playground.architecture.IAppDataAidlInterface
  {
    @Override public void updateAppData(java.lang.String appData, java.lang.String type) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.playground.architecture.IAppDataAidlInterface
  {
    private static final java.lang.String DESCRIPTOR = "com.playground.architecture.IAppDataAidlInterface";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.playground.architecture.IAppDataAidlInterface interface,
     * generating a proxy if needed.
     */
    public static com.playground.architecture.IAppDataAidlInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.playground.architecture.IAppDataAidlInterface))) {
        return ((com.playground.architecture.IAppDataAidlInterface)iin);
      }
      return new com.playground.architecture.IAppDataAidlInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_updateAppData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.updateAppData(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.playground.architecture.IAppDataAidlInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void updateAppData(java.lang.String appData, java.lang.String type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(appData);
          _data.writeString(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAppData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateAppData(appData, type);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.playground.architecture.IAppDataAidlInterface sDefaultImpl;
    }
    static final int TRANSACTION_updateAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.playground.architecture.IAppDataAidlInterface impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.playground.architecture.IAppDataAidlInterface getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void updateAppData(java.lang.String appData, java.lang.String type) throws android.os.RemoteException;
}
