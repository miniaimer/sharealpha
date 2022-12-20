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
    //Get Data from table AppData from Database DataStore

    @Override public java.lang.String getAllAppData() throws android.os.RemoteException
    {
      return null;
    }
    //Insert Data into table AppData from Database DataStore

    @Override public void insertAppData(java.lang.String appData) throws android.os.RemoteException
    {
    }
    //Delete Data from table AppData from Database DataStore

    @Override public void updateAppData(java.lang.String appData) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String Add10Points(java.lang.String packageName) throws android.os.RemoteException
    {
      return null;
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
        case TRANSACTION_getAllAppData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getAllAppData();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_insertAppData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.insertAppData(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_updateAppData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.updateAppData(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_Add10Points:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.Add10Points(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
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
      //Get Data from table AppData from Database DataStore

      @Override public java.lang.String getAllAppData() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllAppData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAllAppData();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //Insert Data into table AppData from Database DataStore

      @Override public void insertAppData(java.lang.String appData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(appData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_insertAppData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().insertAppData(appData);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      //Delete Data from table AppData from Database DataStore

      @Override public void updateAppData(java.lang.String appData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(appData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAppData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateAppData(appData);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String Add10Points(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_Add10Points, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().Add10Points(packageName);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.playground.architecture.IAppDataAidlInterface sDefaultImpl;
    }
    static final int TRANSACTION_getAllAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_insertAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_updateAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_Add10Points = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
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
  //Get Data from table AppData from Database DataStore

  public java.lang.String getAllAppData() throws android.os.RemoteException;
  //Insert Data into table AppData from Database DataStore

  public void insertAppData(java.lang.String appData) throws android.os.RemoteException;
  //Delete Data from table AppData from Database DataStore

  public void updateAppData(java.lang.String appData) throws android.os.RemoteException;
  public java.lang.String Add10Points(java.lang.String packageName) throws android.os.RemoteException;
}
