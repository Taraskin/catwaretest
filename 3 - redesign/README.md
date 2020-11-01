**Retail eCommerce improvements**


Opportunities:
- 
- Move from traditional 3-layers system to modern containerized micro-services;
- Separate view layer from model/business logic;
- Split monolith into smaller logical/functional pieces i.e.: 
    - *product's*: search, store, logistics, delivery 
    - *customer's*: bucket flow, orders, reviews
    - *processing*: payments, cancellations
    - *interactions*: push and mail notifications, ads, etc.;
- Migrate on-premises software to cloud to reduce costs for maintenance and to empower accessibility and user experience;
- Introduce load-balancing and horizontal scaling for most critical services on demand of peak loads;
- Optimize routing, use CDN, browser cache and content optimization to deliver *static* resources faster;
- Use cache, key-value store where it makes sense: search,  cached data, etc.;
- Build mobile application (PWA or native/universal like Flutter) for better user engagement; 
- Switch from RDBMS to NoSQL data-store, highly scalable and fast;
- Potentially BigData and ML might be used for data analysis, structure, customers advises, etc.; 
- Check if event-driven solution can be introduced for extremely high-loaded processes;
- Streaming solution (Apache Kafka) might be added as well;
- Distributed development - delegate proper tasks to the best problem solvers, introduce parallel remote work; 

Challenges and risks:
- 
- Raise investment at the beginning (rewrite/migrate/develop mobile version);
- Higher level uncertainty in case of wrong solution/decision/planning or unclear goals/requirements and so on;
- Collaboration issues, mostly at the beginning - because of parallel work and new tech stack;
- Total/partial application/services re-write requires enough resources/competence/management;
- Moving to the cloud might be painful (adopt to new infrastructure), requires cost- & resource-efficient approaches;
- Changing RDBMS to NoSQL requires data model restructuring/redesign and app re-write;
- Extended data processing (BigData/ML) require more resources;

In any case - try to follow best practices and well-known use-cases. 

If properly configured and established process, even with possible drawbacks at the beginning phase,
in total it will be beneficial for all:
- end-customers - will get better experience and satisfaction of shopping process;
- developers - will get new tech.stack/development and challenges to solve;
- customer - will improve end-customer engagement and increase revenue in total.