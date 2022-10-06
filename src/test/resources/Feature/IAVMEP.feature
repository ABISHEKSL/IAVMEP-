@TestDataReading
Feature: IAVMEP

  Scenario:  CREAT AND VALIDATE IAVMEP
    Given To Launch Browser
    When To Launch IAVMEP URL
    Then To Complete Launch Browser
    #Entity Registration
    #Outside AHU
    Given To create Entity Reg
    When To create Entity Reg Outside AUH
    Then To Complete Entity Reg Outside AUH
         # Entity Registration
        # INside AHU
    Given To creat Entity Reg out
    When To creat Entity Reg INside AUH
    Then To Complete Entity Reg Inside AUH
      #Entity Registration
      #Private owners
    Given To creat Entity Reg Private
    When To creat Entity Reg Private owners
    Then To Complete Entity Reg Private owners who need permits for their vehicles
      #Entity Registration
      # Government entities
    Given To creat Entity Reg Government
    When To creat Entity Reg  Government entities
    Then To Complete Entity Reg Government entities without trade license that need permits for their vehicles
      #Entity Registration
      # Schools Bus
    Given To creat Entity Reg Bus
    When To creat Entity Reg  Schools Bus
    Then To Complete Entity Reg Schools that do not own school buses, but employ school bus supervisors
        #Entity Registration
      # Entity Suppliers
    Given To creat Entity Reg Suppliers
    When To creat Entity Suppliers
    Then To Complete Entity Reg Suppliers wishing to obtain certification for their vehicle tracking devices
       #Entity Registration
      # Workshops for installation
    Given To creat Entity Reg Workshops
    When To creat Entity  Workshops for installation
    Then To Complete Entity Reg Workshops for installation of tracking devices wishing to obtain certification
       #Authority approvel
      #Outside AUH
    Given To verify Approvel By Authority
    When To Approve Entity Reg Outside AUH  by Authority
    Then To Complete Entity Registration Outside UAE Approvel
      #Authority approvel
      #  Permit Officer
    Given To verify Approvel By  Permit Officer
    When To Approve Entity Reg By   Permit Officer
    Then To Complete Entity By  Permit Officer
       #Authority approvel
      # Permit Head
    Given To verify Approvel By Permit Head
    When To Approve Entity Reg By  Permit Head
    Then To Complete Entity By Permit Head