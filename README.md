# RMI Bank Application

## Overview

This repository contains a Java Remote Method Invocation (RMI) application designed for remote interactions with bank accounts (`Compte` objects) through a server-client architecture.

## Components

### 1. `Compte` Class

The `Compte` class represents a bank account and supports serialization for RMI communication. It includes attributes like account code (`code`), balance (`solde`), and creation date (`dateC`).

### 2. `Obj` Class

The `Obj` class implements the `Device` interface and extends `UnicastRemoteObject`. This class acts as the server-side remote object, providing methods for remote invocation.

#### Methods:

- **Change(double s):** Multiplies the input value `s` by 3.35 and returns the result (change the device from TND to EUR).

- **consulterCompte(int cod):** Creates and returns a `Compte` object with a random balance for the provided account code (`cod`).

- **ListeCompte():** Returns an `ArrayList` of `Compte` objects, each initialized with random values.

## Usage

1. **Compile the Code:**
   - Compile all Java files (`Compte.java`, `Obj.java`, `Server.java`, `ClientRMI.java`).

2. **Start the Server:**
   - Run the `Server` class to initiate the RMI registry and bind the remote object.

3. **Run the Client:**
   - Execute the `ClientRMI` class to interact with the remote object.

**Note:** Ensure the RMI registry is running before starting the client. Replace the hostname "localhost" with the appropriate IP address if needed.


